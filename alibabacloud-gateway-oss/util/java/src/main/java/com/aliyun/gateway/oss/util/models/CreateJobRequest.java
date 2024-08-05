// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gateway.oss.util.models;

import com.aliyun.tea.*;

public class CreateJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ImportJob")
    public CreateJobInfo importJob;

    public static CreateJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobRequest self = new CreateJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobRequest setImportJob(CreateJobInfo importJob) {
        this.importJob = importJob;
        return this;
    }
    public CreateJobInfo getImportJob() {
        return this.importJob;
    }

}
