package dio.web.api.handler;

import java.util.Date;

public class ResponseError {
	private Date timestamp = new Date(); //Marca o momento exatto da geração da exceção
	private String status = "error"; // campo customizado de acordo com seu domínio de negócio
	private int statusCode = 400; // pode ser um dicionário de erro da sua aplicação
	private String error; // mensagem apresentada ao usuário da aplicação


    public Date getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public int getStatusCode() {
        return statusCode;
    }
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
    public String getError() {
        return error;
    }
    public void setError(String error) {
        this.error = error;
    }
	
	
}
