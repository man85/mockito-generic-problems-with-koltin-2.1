package org.bug.kotlin

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mockito.mock
import org.mockito.junit.jupiter.MockitoExtension
import org.mockito.kotlin.whenever

@ExtendWith(MockitoExtension::class)
class TestMockGeneric {
    @Test
    fun test() {
        val rRegistry = mock<RRegistry>()
        val rRepository = mock<RRepository<ARBArgs, ARBResult>>()

        whenever(rRegistry.get()).thenReturn(
            rRepository as RRepository<RArgs, RResult>
        )

        val res = mock<AResource>()
        whenever(rRepository.method())
            .thenReturn(
                res as RResource<RArgs, RResult>
            )
    }
}
