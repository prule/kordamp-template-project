package com.example.subproject1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Main1Test {

    @Test
    void messageShouldBeCorrect() {
        assertThat(new Main1().getMessage()).isEqualTo("Main1 Hello world");
    }

}