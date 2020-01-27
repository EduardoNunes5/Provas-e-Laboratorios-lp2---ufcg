
class Saude:

    def __init__(self):
        self._saude_mental = 'boa'
        self._saude_fisica = 'boa'

    def define_saude_mental(self, valor):
        self._saude_mental = valor

    def define_saude_fisica(self, valor):
        self._saude_fisica = valor

    def status_geral(self):
        if self._saude_fisica == 'boa' and self._saude_mental == 'boa':
            return 'boa'
        elif self._saude_fisica == 'fraca' and self._saude_mental == 'fraca':
            return 'fraca'
        else:
            return 'ok'
