// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gateway.oss.util.models;

import com.aliyun.tea.*;

public class ListJobResponseBody extends TeaModel {
    @NameInMap("ImportJobList")
    public ListJobResp importJobList;

    public static ListJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobResponseBody self = new ListJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobResponseBody setImportJobList(ListJobResp importJobList) {
        this.importJobList = importJobList;
        return this;
    }
    public ListJobResp getImportJobList() {
        return this.importJobList;
    }

}
