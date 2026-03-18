package com.example.projetobuscadiploma.infra;

import com.example.projetobuscadiploma.exception.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.server.ServerErrorException;

import java.time.LocalDateTime;

@ControllerAdvice
public class RestExceptionHandler{


    @ExceptionHandler(HttpServerErrorException.InternalServerError.class)
    public ResponseEntity<RestErrorMessage> handlerHttpServerErrorException (HttpServerErrorException.InternalServerError e){
        return new ResponseEntity<>(
                RestErrorMessage.builder()
                        .timestamp(LocalDateTime.now())
                        .status(HttpStatus.INTERNAL_SERVER_ERROR.value())
                        .title("Internal Server Error Exception")
                        .details(e.getMessage())
                        .developerMessage(e.getClass().getName()).build(), HttpStatus.INTERNAL_SERVER_ERROR
        );
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<RestErrorMessage> handlerEntityNotFound (EntityNotFoundException e){
        return new ResponseEntity<>(
                RestErrorMessage.builder()
                        .timestamp(LocalDateTime.now())
                        .status(HttpStatus.BAD_REQUEST.value())
                        .title("Not found!")
                        .details(e.getMessage())
                        .developerMessage(e.getMessage()).build(), HttpStatus.BAD_REQUEST
        );
    }


    @ExceptionHandler(ErrorServerException.class)
    public ResponseEntity<RestErrorMessage> handlerErrorServerException (ServerErrorException e){
        return new ResponseEntity<>(
                RestErrorMessage.builder()
                        .timestamp(LocalDateTime.now())
                        .status(HttpStatus.INTERNAL_SERVER_ERROR.value())
                        .title("Internal Server Error Exception")
                        .details(e.getMessage())
                        .developerMessage(e.getClass().getName()).build(), HttpStatus.INTERNAL_SERVER_ERROR
        );
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<RestErrorMessage> handlerNotFoundException (NotFoundException e){
        return new ResponseEntity<>(
                RestErrorMessage.builder()
                        .timestamp(LocalDateTime.now())
                        .status(HttpStatus.NOT_FOUND.value())
                        .title("Object not found!")
                        .details(e.getMessage())
                        .developerMessage(e.getClass().getName()).build(), HttpStatus.NOT_FOUND
        );
    }

    @ExceptionHandler(EventFullException.class)
    public ResponseEntity<RestErrorMessage> handlerEventFullException (EventFullException e){
        return new ResponseEntity<>(
                RestErrorMessage.builder()
                        .timestamp(LocalDateTime.now())
                        .status(HttpStatus.CONFLICT.value())
                        .title("Event concluid")
                        .details(e.getMessage())
                        .developerMessage(e.getClass().getName()).build(), HttpStatus.CONFLICT
        );
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<RestErrorMessage> handleMessageNotReadable (HttpMessageNotReadableException e){
        return new ResponseEntity<>(
                RestErrorMessage.builder()
                        .timestamp(LocalDateTime.now())
                        .status(HttpStatus.BAD_REQUEST.value())
                        .title("Corpo de requisição")
                        .details("O corpo da requisição (JSON) está ausente ou mal formado não permitindo a execução da operação")
                        .developerMessage(e.getClass().getName()).build(), HttpStatus.BAD_REQUEST
        );
    }







}
