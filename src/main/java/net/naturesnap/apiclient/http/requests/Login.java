package net.naturesnap.apiclient.http.requests;

import net.naturesnap.apiclient.http.enums.Format;
import net.naturesnap.apiclient.http.enums.Type;
import net.naturesnap.apiclient.http.results.Code;

public class Login extends Request {
	public Login(){
		this.setEndpoint("login.php");
		this.setFormat(Format.CODE);
		this.setParams("username", "password");
		this.setType(Type.POST);
		this.setResult(Code.class);
	}
}