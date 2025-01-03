// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gateway.oss.util.models;

import com.aliyun.tea.*;

public class InitiateWormConfiguration extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RetentionPeriodInDays")
    public Integer retentionPeriodInDays;

    public static InitiateWormConfiguration build(java.util.Map<String, ?> map) throws Exception {
        InitiateWormConfiguration self = new InitiateWormConfiguration();
        return TeaModel.build(map, self);
    }

    public InitiateWormConfiguration setRetentionPeriodInDays(Integer retentionPeriodInDays) {
        this.retentionPeriodInDays = retentionPeriodInDays;
        return this;
    }
    public Integer getRetentionPeriodInDays() {
        return this.retentionPeriodInDays;
    }

}
