/*
 * Macweese, macweese@pm.me
 * Date 2020-10-17 (YYYY-MM-DD)
 *
 * redacted
 * limited public version
 * omitted information for privacy
 */

import javax.swing.*;
import java.awt.event.*;

// redacted
public class TextSearchGUI extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JCheckBox ignoreCaseSensitivityCheckBox;
    private JCheckBox independentTermsOnlyCheckBox;
    private JCheckBox consoleStatsCheckBox;
    private JTextArea textContent;
    private JTextArea key;

    String text;
    String search;
    String[] textContents;
    int n = 0;

    // Search settings
    Boolean caseSensitive;
    Boolean independentTerms;
    Boolean consoleStats;


    public TextSearchGUI()
    {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        textContent.setLineWrap(true);

        buttonOK.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                onCancel();
            }
        });

        // call onCancel() when X is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                onCancel();
            }
        });

        // call onCancel() on Esc key
        contentPane.registerKeyboardAction(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK()
    {
        // Write values to variables on OK
        text = textContent.getText();
        search = key.getText();
        caseSensitive = ignoreCaseSensitivityCheckBox.isSelected();
        independentTerms = independentTermsOnlyCheckBox.isSelected();
        consoleStats = consoleStatsCheckBox.isSelected();

        searchKeyword(caseSensitive, independentTerms);

        // Print user inputs & stats to console
        if (consoleStats)
        {
            System.out.println("Text: " + textContent.getText());
            System.out.println("Search: " + key.getText());
            System.out.println("Words only: " + (independentTerms ? "Yes" : "No"));
            System.out.println("Case sensetive: " + (caseSensitive ? "Yes" : "No"));
            System.out.println("Match(es) found: " + n);
        }

        dispose();
    }

    private void onCancel()
    {
        System.out.println("User canceled operation - Exiting program.");
        dispose();
    }

    /**
     * Searches text for the key passed from the JDialog
     *
     * @param caseSensitivity case sensitive search - when true will distinguish between lowercase and uppercase i.e. "heLLo" will not match with "hello"
     * @param regex will split whitespaces, on true will only match complete words or substrings of words
     */
    public void searchKeyword(boolean caseSensitivity, boolean regex)
    {
        if (text == null || search == null || text.isEmpty() || search.isEmpty())
        {
            resultMessage(true);
            return;
        }

        if (!caseSensitivity)
        {
            text = text.toLowerCase();
            search = search.toLowerCase();
        }
        else
        {
            text = textContent.getText();
            search = key.getText();
        }

        if (regex)
        {
            textContents = text.split(" ");
            for (String content : textContents)
            {
                if (content.contains(search))
                    n++;
            }
        }
        else
        {
            for (int i = 0; i < text.length(); i++)
            {
                if (i == text.indexOf(search, i))
                {
                    if (consoleStats)
                        System.out.println("Found match at index: " + i);
                    n++;
                }

            }
        }

        resultMessage(false);
    }

    /**
     * The message popup once operation has been conducted
     *
     * @param error true if operation was failure otherwise false
     */
    public void resultMessage(boolean error)
    {

        if (error)
            JOptionPane.showMessageDialog(null, "Invalid text or search paramater", "Error", JOptionPane.ERROR_MESSAGE);
        else
        {
            if (n == 0)
                JOptionPane.showMessageDialog(null, "No matches for '" + key.getText() + "'", "Result", JOptionPane.PLAIN_MESSAGE);
            else if (n == 1)
                JOptionPane.showMessageDialog(null, "Found " + n + " match for '" + key.getText() + "'", "Result", JOptionPane.PLAIN_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, "Found " + n + " matches for '" + key.getText() + "'", "Result", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public static void main(String[] args)
    {
        TextSearchGUI dialog = new TextSearchGUI();
        dialog.setTitle("Text Searching Tool - Hussein Al Noori");
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

}
