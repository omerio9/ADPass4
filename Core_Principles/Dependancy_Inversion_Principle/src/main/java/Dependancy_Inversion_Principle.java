public class Dependancy_Inversion_Principle {

    public class BackEndCode {

        public void runJava() {
        }
    }

    public class FrontEndCode {

        public void runJavascript() {
        }

    }
    public class Program {

        private BackEndCode backEndCode = new BackEndCode();
        private FrontEndCode frontEndCode = new FrontEndCode();

        public void implement() {

            backEndDeveloper.writeJava();
            frontEndDeveloper.writeJavascript();
        }

    }
    /***************REFACTORED CODE*********************/
  //  The code below fixes the violation because the Program class is dependant on both other modules

    public interface ProgramCode {

        void develop();
    }
    public class BackEndCode implements ProgramCode {

        @Override
        public void develop() {
            runJava();
        }

        private void runJava() {
        }

    }
    ////////////////////////////////////////
    public class FrontEndCode implements ProgramCode {

        @Override
        public void develop() {
            runJavascript();
        }

        public void runJavascript() {
        }

    }
    //The next step in order to tackle the violation of the first part would be to refactor the Program class so that it will not depend on the FrontEndCode and the BackendCode class.

import java.util.List;

    public class Program {

        private List<ProgramCode> code;

        public Program(List<ProgramCode> code) {

            this.code = code;
        }

        public void implement() {

            code.forEach(d->d.develop());
        }


}
