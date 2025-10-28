// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.services.async

import com.arcade_engine.api.services.async.admin.AuthProviderServiceAsync
import com.arcade_engine.api.services.async.admin.SecretServiceAsync
import com.arcade_engine.api.services.async.admin.UserConnectionServiceAsync

interface AdminServiceAsync {

    fun userConnections(): UserConnectionServiceAsync

    fun authProviders(): AuthProviderServiceAsync

    fun secrets(): SecretServiceAsync
}
