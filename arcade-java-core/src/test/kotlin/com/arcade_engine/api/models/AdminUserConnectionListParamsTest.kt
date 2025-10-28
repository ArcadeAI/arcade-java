// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.models

import com.arcade_engine.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AdminUserConnectionListParamsTest {

    @Test
    fun create() {
        AdminUserConnectionListParams.builder()
            .limit(0L)
            .offset(0L)
            .provider(AdminUserConnectionListParams.Provider.builder().id("id").build())
            .user(AdminUserConnectionListParams.User.builder().id("id").build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AdminUserConnectionListParams.builder()
                .limit(0L)
                .offset(0L)
                .provider(AdminUserConnectionListParams.Provider.builder().id("id").build())
                .user(AdminUserConnectionListParams.User.builder().id("id").build())
                .build()
        val expected = QueryParams.builder()
        expected.put("limit", "0")
        expected.put("offset", "0")
        AdminUserConnectionListParams.Provider.builder().id("id").build().forEachQueryParam {
            key,
            values ->
            expected.put("provider[$key]", values)
        }
        AdminUserConnectionListParams.User.builder().id("id").build().forEachQueryParam {
            key,
            values ->
            expected.put("user[$key]", values)
        }
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AdminUserConnectionListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
