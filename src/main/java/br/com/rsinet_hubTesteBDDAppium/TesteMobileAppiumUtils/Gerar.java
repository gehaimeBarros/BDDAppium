package br.com.rsinet_hubTesteBDDAppium.TesteMobileAppiumUtils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Gerar {

	public static String dataHoraParaArquivo() {
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		return new SimpleDateFormat("yyyyMMddhhmmss").format(ts);
	}
}
