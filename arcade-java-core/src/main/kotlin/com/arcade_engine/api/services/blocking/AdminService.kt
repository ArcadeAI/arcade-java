// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.services.blocking

import com.arcade_engine.api.services.blocking.admin.AuthProviderService
import com.arcade_engine.api.services.blocking.admin.SecretService
import com.arcade_engine.api.services.blocking.admin.UserConnectionService

interface AdminService {

    fun userConnections(): UserConnectionService

    fun authProviders(): AuthProviderService

    fun secrets(): SecretService
}
