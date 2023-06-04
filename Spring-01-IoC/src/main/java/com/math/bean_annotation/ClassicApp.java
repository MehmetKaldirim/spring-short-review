package com.math.bean_annotation;

public class ClassicApp {

    public static void main(String[] args) {

        FullTimeMentor fullTimeMentor= new FullTimeMentor();
        PartTimeMentor partTimeMentor= new PartTimeMentor();

        fullTimeMentor.createAccount();
        partTimeMentor.createAccount();
    }

    }
