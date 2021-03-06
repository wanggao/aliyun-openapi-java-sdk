/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.teslamaxcompute.model.v20180104;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class QueryCustomerSaleInfoRequest extends RpcAcsRequest<QueryCustomerSaleInfoResponse> {
	
	public QueryCustomerSaleInfoRequest() {
		super("TeslaMaxCompute", "2018-01-04", "QueryCustomerSaleInfo");
	}

	private String regionName;

	public String getRegionName() {
		return this.regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
		if(regionName != null){
			putQueryParameter("RegionName", regionName);
		}
	}

	@Override
	public Class<QueryCustomerSaleInfoResponse> getResponseClass() {
		return QueryCustomerSaleInfoResponse.class;
	}

}
