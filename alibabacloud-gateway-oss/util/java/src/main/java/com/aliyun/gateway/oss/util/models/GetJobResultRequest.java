// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gateway.oss.util.models;

import com.aliyun.tea.*;

public class GetJobResultRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("runtimeId")
    public Integer runtimeId;

    public static GetJobResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobResultRequest self = new GetJobResultRequest();
        return TeaModel.build(map, self);
    }

    public GetJobResultRequest setRuntimeId(Integer runtimeId) {
        this.runtimeId = runtimeId;
        return this;
    }
    public Integer getRuntimeId() {
        return this.runtimeId;
    }

}
