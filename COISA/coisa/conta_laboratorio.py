

class ContaLaboratorio:

    def __init__(self, nome, cota = 2000):
        self._nome = nome
        self._cota = cota
        self._espaco_ocupado = 0

    def consome_espaco(self, mbytes):
        self._espaco_ocupado += mbytes

    def libera_espaco(self, mbytes):
        self._espaco_ocupado -= mbytes

    def to_string(self):
        return '{} {}/{}' .format(self._nome, self._espaco_ocupado, self._cota)

    def atingiu_cota(self):
        if self._cota - self._espaco_ocupado > 0:
            return False
        else:
            return True

