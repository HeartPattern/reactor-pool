/*
 * Copyright (c) 2011-2019 Pivotal Software Inc, All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package reactor.util.pool.metrics;

/**
 * A No-Op {@link MetricsRecorder} that can be used as a default if instrumentation is not desired.
 *
 * @author Simon Baslé
 */
public final class NoOpMetricsRecorder implements MetricsRecorder {

    public static final NoOpMetricsRecorder INSTANCE = new NoOpMetricsRecorder();

    private NoOpMetricsRecorder() {

    }

    @Override
    public long now() {
        return 0L;
    }

    @Override
    public long measureTime(long startTimeMillis) {
        return 0;
    }

    @Override
    public void recordAllocationSuccessAndLatency(long latencyMs) {

    }

    @Override
    public void recordAllocationFailureAndLatency(long latencyMs) {

    }

    @Override
    public void recordResetLatency(long latencyMs) {

    }

    @Override
    public void recordDestroyLatency(long latencyMs) {

    }

    @Override
    public void recordRecycled() {

    }

    @Override
    public void recordIdleTime(long millisecondsIdle) {

    }

    @Override
    public void recordLifetimeDuration(long millisecondsSinceAllocation) {

    }

    @Override
    public void recordSlowPath() {

    }

    @Override
    public void recordFastPath() {

    }
}
