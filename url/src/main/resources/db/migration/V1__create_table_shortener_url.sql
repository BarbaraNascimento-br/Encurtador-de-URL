CREATE TABLE encurtador(
    id SERIAL PRIMARY KEY,
    original_url TEXT NOT NULL,
    curto_url VARCHAR(20) UNIQUE NOT NULL,
    data_da_url TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    numeros_de_clicks INTEGER DEFAULT 0
);