// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gateway.oss.util.models;

import com.aliyun.tea.*;

public class ListStyleResponseBody extends TeaModel {
    /**
     * <p>The container that was used to query the information about image styles.</p>
     */
    @NameInMap("StyleList")
    public StyleList styleList;

    public static ListStyleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStyleResponseBody self = new ListStyleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStyleResponseBody setStyleList(StyleList styleList) {
        this.styleList = styleList;
        return this;
    }
    public StyleList getStyleList() {
        return this.styleList;
    }

    public static class StyleList extends TeaModel {
        /**
         * <p>The list of styles.</p>
         */
        @NameInMap("Style")
        public java.util.List<StyleInfo> style;

        public static StyleList build(java.util.Map<String, ?> map) throws Exception {
            StyleList self = new StyleList();
            return TeaModel.build(map, self);
        }

        public StyleList setStyle(java.util.List<StyleInfo> style) {
            this.style = style;
            return this;
        }
        public java.util.List<StyleInfo> getStyle() {
            return this.style;
        }

    }

}
