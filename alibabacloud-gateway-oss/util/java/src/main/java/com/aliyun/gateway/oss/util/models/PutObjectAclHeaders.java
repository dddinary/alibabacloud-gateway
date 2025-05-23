// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gateway.oss.util.models;

import com.aliyun.tea.*;

public class PutObjectAclHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The access control list (ACL) of the object.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("x-oss-object-acl")
    public String acl;

    public static PutObjectAclHeaders build(java.util.Map<String, ?> map) throws Exception {
        PutObjectAclHeaders self = new PutObjectAclHeaders();
        return TeaModel.build(map, self);
    }

    public PutObjectAclHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public PutObjectAclHeaders setAcl(String acl) {
        this.acl = acl;
        return this;
    }
    public String getAcl() {
        return this.acl;
    }

}
