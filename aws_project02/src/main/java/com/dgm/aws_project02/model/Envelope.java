package com.dgm.aws_project02.model;

import com.dgm.aws_project02.enums.EventType;
import lombok.Data;

@Data
public class Envelope {

    private EventType eventType;

    private String data;
}
