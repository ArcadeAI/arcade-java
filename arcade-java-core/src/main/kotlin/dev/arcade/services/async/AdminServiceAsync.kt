// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.async

import dev.arcade.services.async.admin.AuthProviderServiceAsync
import dev.arcade.services.async.admin.SecretServiceAsync
import dev.arcade.services.async.admin.UserConnectionServiceAsync

interface AdminServiceAsync {

    fun userConnections(): UserConnectionServiceAsync

    fun authProviders(): AuthProviderServiceAsync

    fun secrets(): SecretServiceAsync
}
