// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gateway.oss.util.models;

import com.aliyun.tea.*;

public class GetMetaQueryStatusResponseBody extends TeaModel {
    /**
     * <p>The container that stores the metadata information.</p>
     */
    @NameInMap("MetaQueryStatus")
    public MetaQueryStatus metaQueryStatus;

    public static GetMetaQueryStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaQueryStatusResponseBody self = new GetMetaQueryStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaQueryStatusResponseBody setMetaQueryStatus(MetaQueryStatus metaQueryStatus) {
        this.metaQueryStatus = metaQueryStatus;
        return this;
    }
    public MetaQueryStatus getMetaQueryStatus() {
        return this.metaQueryStatus;
    }

    public static class MetaQueryStatus extends TeaModel {
        /**
         * <p>The time when the metadata index library was created. The value follows the RFC 3339 standard in the YYYY-MM-DDTHH:mm:ss+TIMEZONE format. YYYY-MM-DD indicates the year, month, and day. T indicates the beginning of the time element. HH:mm:ss indicates the hour, minute, and second. TIMEZONE indicates the time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-02T10:49:17.289372919+08:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The scan type. Valid values:</p>
         * <ul>
         * <li>FullScanning: Full scanning is in progress.</li>
         * <li>IncrementalScanning: Incremental scanning is in progress.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FullScanning</p>
         */
        @NameInMap("Phase")
        public String phase;

        /**
         * <p>The status of the metadata index library. Valid values:</p>
         * <ul>
         * <li><p>Ready: The metadata index library is being prepared after it is created.
         * In this case, the metadata index library cannot be used to query data.</p>
         * </li>
         * <li><p>Stop: The metadata index library is paused.</p>
         * </li>
         * <li><p>Running: The metadata index library is running.</p>
         * </li>
         * <li><p>Retrying: The metadata index library failed to be created and is being created again.</p>
         * </li>
         * <li><p>Failed: The metadata index library failed to be created.</p>
         * </li>
         * <li><p>Deleted: The metadata index library is deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Runing</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The time when the metadata index library was updated. The value follows the RFC 3339 standard in the YYYY-MM-DDTHH:mm:ss+TIMEZONE format. YYYY-MM-DD indicates the year, month, and day. T indicates the beginning of the time element. HH:mm:ss indicates the hour, minute, and second. TIMEZONE indicates the time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-02T10:49:17.289372919+08:00</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static MetaQueryStatus build(java.util.Map<String, ?> map) throws Exception {
            MetaQueryStatus self = new MetaQueryStatus();
            return TeaModel.build(map, self);
        }

        public MetaQueryStatus setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public MetaQueryStatus setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public MetaQueryStatus setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public MetaQueryStatus setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
