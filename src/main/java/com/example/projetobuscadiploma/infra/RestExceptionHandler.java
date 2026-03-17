package com.example.projetobuscadiploma.infra;

import com.example.projetobuscadiploma.exception.ErrorServerException;
import com.example.projetobuscadiploma.exception.EventFullException;
import com.example.projetobuscadiploma.exception.NotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.server.ServerErrorException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {


    @ExceptionHandler(HttpServerErrorException.InternalServerError.class)
    public ResponseEntity<RestErrorMessage> handlerErrorServerException (HttpServerErrorException.InternalServerError e){
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
    public ResponseEntity<RestErrorMessage> handlerErrorServerException (EntityNotFoundException e){
        return new ResponseEntity<>(
                RestErrorMessage.builder()
                        .timestamp(LocalDateTime.now())
                        .status(HttpStatus.BAD_REQUEST.value())
                        .title("Object not found!")
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
    public ResponseEntity<RestErrorMessage> handlerErrorServerException (NotFoundException e){
        return new ResponseEntity<>(
                RestErrorMessage.builder()
                        .timestamp(LocalDateTime.now())
                        .status(HttpStatus.BAD_REQUEST.value())
                        .title("Object not found!")
                        .details(e.getMessage())
                        .developerMessage(e.getClass().getName()).build(), HttpStatus.BAD_REQUEST
        );
    }

    @ExceptionHandler(EventFullException.class)
    public ResponseEntity<RestErrorMessage> handlerErrorServerException (EventFullException e){
        return new ResponseEntity<>(
                RestErrorMessage.builder()
                        .timestamp(LocalDateTime.now())
                        .status(HttpStatus.CONFLICT.value())
                        .title("Event concluid")
                        .details(e.getMessage())
                        .developerMessage(e.getClass().getName()).build(), HttpStatus.CONFLICT
        );
    }



}
