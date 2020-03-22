package com.hmanikkothu.mspgpoc.devicelist.data;

import com.hmanikkothu.mspgpoc.core.data.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeviceListRequest extends Entity {
	private String deviceCode;

}
