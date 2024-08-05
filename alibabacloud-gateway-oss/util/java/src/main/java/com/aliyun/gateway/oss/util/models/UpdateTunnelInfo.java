// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gateway.oss.util.models;

import com.aliyun.tea.*;

public class UpdateTunnelInfo extends TeaModel {
    @NameInMap("Tags")
    public String tags;

    @NameInMap("TunnelQos")
    public TunnelQos tunnelQos;

    public static UpdateTunnelInfo build(java.util.Map<String, ?> map) throws Exception {
        UpdateTunnelInfo self = new UpdateTunnelInfo();
        return TeaModel.build(map, self);
    }

    public UpdateTunnelInfo setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public UpdateTunnelInfo setTunnelQos(TunnelQos tunnelQos) {
        this.tunnelQos = tunnelQos;
        return this;
    }
    public TunnelQos getTunnelQos() {
        return this.tunnelQos;
    }

}
