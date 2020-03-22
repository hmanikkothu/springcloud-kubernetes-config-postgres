package com.hmanikkothu.mspgpoc.devicelist.service;

import java.util.List;

import com.hmanikkothu.mspgpoc.devicelist.data.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hmanikkothu.mspgpoc.devicelist.data.DeviceList;
import com.hmanikkothu.mspgpoc.devicelist.data.DeviceListRequest;

@Component
public class DeviceRepositoryService {

	@Autowired
	DeviceRepository deviceRepository;

	public DeviceList getDeviceList(DeviceListRequest request) {
		List<Device> list = deviceRepository.findByCode(request.getDeviceCode());
		return new DeviceList(list);
	}

}
