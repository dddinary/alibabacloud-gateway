// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gateway.oss.util.models;

import com.aliyun.tea.*;

public class DeleteObjectRequest extends TeaModel {
    /**
     * <p>The version ID of the object.</p>
     * 
     * <strong>example:</strong>
     * <p>CAEQMxiBgIDh3ZCB0BYiIGE4YjIyMjExZDhhYjQxNzZiNGUyZTI4ZjljZDcz****</p>
     */
    @NameInMap("versionId")
    public String versionId;

    public static DeleteObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteObjectRequest self = new DeleteObjectRequest();
        return TeaModel.build(map, self);
    }

    public DeleteObjectRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
