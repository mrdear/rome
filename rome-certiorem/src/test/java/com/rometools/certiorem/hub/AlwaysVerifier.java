/**
 *
 *  Copyright (C) The ROME Team  2011
 *
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.rometools.certiorem.hub;

import com.rometools.certiorem.hub.Verifier;
import com.rometools.certiorem.hub.data.Subscriber;

/**
 *
 * @author robert.cooper
 */
public class AlwaysVerifier implements Verifier {

    @Override
    public void verifySubscribeAsyncronously(final Subscriber subscriber, final VerificationCallback callback) {
        callback.onVerify(true);
    }

    @Override
    public boolean verifySubcribeSyncronously(final Subscriber subscriber) {
        return true;
    }

    @Override
    public void verifyUnsubscribeAsyncronously(final Subscriber subscriber, final VerificationCallback callback) {
        callback.onVerify(true);
    }

    @Override
    public boolean verifyUnsubcribeSyncronously(final Subscriber subscriber) {
        return true;
    }

}
