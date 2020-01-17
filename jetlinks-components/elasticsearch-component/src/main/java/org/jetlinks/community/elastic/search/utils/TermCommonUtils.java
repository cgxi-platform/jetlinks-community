package org.jetlinks.community.elastic.search.utils;

import java.util.*;

/**
 * @author bsetfeng
 * @since 1.0
 **/
public class TermCommonUtils {

    public static List<Object> convertToList(Object value) {
        if (value == null) {
            return Collections.emptyList();
        }
        if (value instanceof String) {
            value = ((String) value).split(",");
        }

        if (value instanceof Object[]) {
            value = Arrays.asList(((Object[]) value));
        }

        if (value instanceof Collection) {
            return new ArrayList<Object>(((Collection) value));
        }

        return Arrays.asList(value);
    }

    public static Object getStandardsTermValue(List<Object> value) {
        if (value.size() > 0 && value.size() < 2) {
            return value.get(0);
        }
        return value;
    }
}