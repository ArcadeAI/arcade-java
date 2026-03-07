// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.admin.userconnections

import dev.arcade.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserConnectionListParamsTest {

    @Test
    fun create() {
        UserConnectionListParams.builder()
            .limit(0L)
            .offset(0L)
            .provider(UserConnectionListParams.Provider.builder().id("id").build())
            .user(UserConnectionListParams.User.builder().id("id").build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            UserConnectionListParams.builder()
                .limit(0L)
                .offset(0L)
                .provider(UserConnectionListParams.Provider.builder().id("id").build())
                .user(UserConnectionListParams.User.builder().id("id").build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("limit", "0")
                    .put("offset", "0")
                    .put("provider[id]", "id")
                    .put("user[id]", "id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = UserConnectionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
