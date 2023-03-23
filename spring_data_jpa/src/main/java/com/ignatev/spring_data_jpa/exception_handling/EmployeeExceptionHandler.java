package com.ignatev.spring_data_jpa.exception_handling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<EmployeeIncorrectData> handleException(
            NoSuchEmployeeException noSuchEmployeeException) {
        EmployeeIncorrectData data = new EmployeeIncorrectData();
        data.setInfo(noSuchEmployeeException.getMessage());

        return new ResponseEntity<EmployeeIncorrectData>(data, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<EmployeeIncorrectData> handleException(
            Exception exception) {
        EmployeeIncorrectData data = new EmployeeIncorrectData();
        data.setInfo(exception.getMessage());

        return new ResponseEntity<EmployeeIncorrectData>(data, HttpStatus.BAD_REQUEST);
    }
}
