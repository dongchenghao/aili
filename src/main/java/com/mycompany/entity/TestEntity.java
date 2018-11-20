package com.mycompany.entity;

import lombok.Getter;
import lombok.Setter;
import org.hswebframework.web.commons.entity.SimpleGenericEntity;
@Getter
@Setter
public class TestEntity extends SimpleGenericEntity<String> {

    private String name;

    private byte status;

    private String comment;
}
