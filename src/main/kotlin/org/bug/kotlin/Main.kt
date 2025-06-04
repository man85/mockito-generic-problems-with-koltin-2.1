package org.bug.kotlin

interface RArgs
abstract class BArgs : RArgs
sealed class ARBArgs : BArgs()

interface RResult
abstract class BResult : RResult
sealed class ARBResult : BResult()

interface RResource<ARGS : RArgs, RES : RResult>
class AResource : RResource<ARBArgs, ARBResult>

interface RRepository<ARGS : RArgs, RES : RResult> {
    fun method(): RResource<ARGS, RES>?
}

interface RRegistry {
    fun get(): RRepository<RArgs, RResult>
}