package com.john.graphite.serialisers;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.john.graphite.security.User;
import com.john.graphite.security.UserContext;
import com.john.graphite.security.UserContextHolder;

public class JsonLocalDateSerializer extends JsonSerializer<LocalDate> {

	DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	@Override
	public void serialize(LocalDate value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
		String formattedDate = DATE_FORMAT.format(value);
		System.out.println("date_Format " + DATE_FORMAT);
		UserContext userContext = UserContextHolder.getContext();
		if (userContext != null && userContext.getUser()!=null) {
			String dateFormat = userContext.getUser().getDateFormat();
			formattedDate = DateTimeFormatter.ofPattern(dateFormat).format(value);
		}
		gen.writeString(formattedDate);
	}

}
