/*
 * Copyright (c) 2024 22. This project was created by Edford Jongwe.
 * Website: www.jongwe-edford.netlify.app
 * Git: /jongwe-edford
 * Instagram: /jongwe_edford
 * Facebook: /jongwe_edford
 * Twitter: /edford_jongwe
 * Dribble: /jongwe_edford
 */

package com.aphrnx.vendormanagement.model;

import lombok.*;

@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Contact {
	private String email;
	private String phone;
	private String mobile;
	private String skype;
	private String linkedin;
	private String twitter;
	private String facebook;
	private String notes;
}
