package com.example.demo.controller;

public class ResponseResult {

        int status;

        String message;

        ResponseResult(int status , String res){
            this.status = status;
            this.message = res;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
}
