// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gateway.oss.util.models;

import com.aliyun.tea.*;

public class SelectObjectRequest extends TeaModel {
    /**
     * <p>The container that stores the SelectObject request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SelectRequest")
    public SelectRequest selectRequest;

    public static SelectObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        SelectObjectRequest self = new SelectObjectRequest();
        return TeaModel.build(map, self);
    }

    public SelectObjectRequest setSelectRequest(SelectRequest selectRequest) {
        this.selectRequest = selectRequest;
        return this;
    }
    public SelectRequest getSelectRequest() {
        return this.selectRequest;
    }

}
