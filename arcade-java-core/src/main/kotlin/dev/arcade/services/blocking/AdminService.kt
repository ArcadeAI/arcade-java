// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.blocking

import dev.arcade.services.blocking.admin.AuthProviderService
import dev.arcade.services.blocking.admin.SecretService
import dev.arcade.services.blocking.admin.UserConnectionService

interface AdminService {

    fun userConnections(): UserConnectionService

    fun authProviders(): AuthProviderService

    fun secrets(): SecretService
}
