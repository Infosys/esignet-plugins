/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */
package io.mosip.signup.plugin.mock.dto;


import lombok.Data;
import java.util.List;

@Data
public class UseCaseScene {

    private List<UseCaseFlow> flow;

    private List<String> verified_claims;

    private String trust_framework;

    private String process_name;
}
