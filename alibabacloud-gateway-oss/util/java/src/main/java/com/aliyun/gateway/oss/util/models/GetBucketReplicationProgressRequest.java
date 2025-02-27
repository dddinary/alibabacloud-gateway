// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gateway.oss.util.models;

import com.aliyun.tea.*;

public class GetBucketReplicationProgressRequest extends TeaModel {
    /**
     * <p>The ID of the data replication rule. You can call the GetBucketReplication operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_replication_1</p>
     */
    @NameInMap("rule-id")
    public String ruleId;

    public static GetBucketReplicationProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBucketReplicationProgressRequest self = new GetBucketReplicationProgressRequest();
        return TeaModel.build(map, self);
    }

    public GetBucketReplicationProgressRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
