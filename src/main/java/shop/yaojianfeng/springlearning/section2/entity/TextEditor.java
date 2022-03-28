package shop.yaojianfeng.springlearning.section2.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * 编辑器类
 *
 * @author yaojianfeng
 */
public class TextEditor {

    private SpellChecker checker;

    @Autowired
    @Qualifier("checker03")
    public void setChecker(SpellChecker checker) {
        this.checker = checker;
    }

    public SpellChecker getChecker() {
        return checker;
    }

    public void spellCheck() {
        checker.checkSpelling();
    }
}
