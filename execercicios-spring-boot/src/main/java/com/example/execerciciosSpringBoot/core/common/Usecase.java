package com.example.execerciciosSpringBoot.core.common;

public interface Usecase<TUsecasePort, TUsecaseResult> {
    TUsecaseResult execute(TUsecasePort port);
}
