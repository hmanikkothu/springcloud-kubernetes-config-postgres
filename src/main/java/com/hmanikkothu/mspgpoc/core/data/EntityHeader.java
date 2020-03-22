package com.hmanikkothu.mspgpoc.core.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class EntityHeader {
	private String serviceName;
	private String serviceQualifier;
	private String serviceVersion;

}
