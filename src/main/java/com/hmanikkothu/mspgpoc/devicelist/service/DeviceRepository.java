package com.hmanikkothu.mspgpoc.devicelist.service;

import com.hmanikkothu.mspgpoc.devicelist.data.Device;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeviceRepository extends JpaRepository<Device, String> {
    public List<Device> findByCode(String code);

}
