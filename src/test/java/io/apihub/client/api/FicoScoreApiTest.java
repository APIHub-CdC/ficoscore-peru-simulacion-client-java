package io.apihub.client.api;

import io.apihub.client.ApiClient;
import io.apihub.client.ApiException;
import io.apihub.client.model.DatosConsulta;
import io.apihub.client.model.Score;
import io.apihub.client.model.DatosConsulta.TipoDocumentoEnum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FicoScoreApiTest {
	private final FicoScoreApi api = new FicoScoreApi();

	@Before()
	public void setUp() {
		ApiClient apiClient = api.getApiClient();
		apiClient.setBasePath("the_url");
	}

	@Test
	public void ficoScoreTest() throws ApiException {
		String xApiKey = "your_api_key";
		DatosConsulta request = new DatosConsulta();
		request.setNumeroDocumento("xxxxx");
		request.setTipoDocumento(TipoDocumentoEnum._1);
		request.setFolioConsultaOtorgante(null);

		try {
			Score response = api.ficoScore(xApiKey, request);
			Assert.assertTrue(response != null);
		} catch (ApiException e) {
			System.out.println(e);
		}
	}
}
