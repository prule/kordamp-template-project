package com.example.subproject1;

import com.example.subproject1.Main1;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Main1Test {

    @Test
    void message_should_be_correct() {
        assertThat(new Main1().getMessage()).isEqualTo("Main1 Hello world");
    }

}