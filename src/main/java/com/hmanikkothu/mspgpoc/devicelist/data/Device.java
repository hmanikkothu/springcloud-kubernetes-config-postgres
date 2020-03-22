package com.hmanikkothu.mspgpoc.devicelist.data;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity (name="device")
public class Device {
    @Id
    private String sku;
    @Column(name = "code")
    private String code;
}
