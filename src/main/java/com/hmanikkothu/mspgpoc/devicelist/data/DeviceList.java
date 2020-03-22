package com.hmanikkothu.mspgpoc.devicelist.data;

import java.util.List;

import com.hmanikkothu.mspgpoc.core.data.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeviceList extends Entity {
	private List<Device> devices;
}
