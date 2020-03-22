package com.hmanikkothu.mspgpoc.devicelist;

import com.hmanikkothu.mspgpoc.devicelist.service.DeviceRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hmanikkothu.mspgpoc.devicelist.data.DeviceList;
import com.hmanikkothu.mspgpoc.devicelist.data.DeviceListRequest;

import lombok.extern.java.Log;

@RestController
@Log
public class DeviceListController {
	
	@Autowired
    DeviceRepositoryService deviceRepositoryService;

	@RequestMapping("/devicelist")
	public DeviceList QueryDeviceListController(@RequestBody DeviceListRequest request) {
		String msg = "request.code=" + request.getDeviceCode();
		log.info(msg);
		return deviceRepositoryService.getDeviceList(request);
	}
	
	@RequestMapping("hello")
	public String hello () {
		return "Hello ";
	}
}
