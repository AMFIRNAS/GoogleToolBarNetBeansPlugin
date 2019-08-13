/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.googletoolbar;

import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
//import org.netbeans.spi.search.provider.SearchProvider.Presenter;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.openide.util.actions.Presenter;

@ActionID(
        category = "File",
        id = "org.myorg.googletoolbar.GoogleActionListner"
)
@ActionRegistration(
        lazy = false,
        displayName = "NOT-USED"
)
@ActionReference(path = "Toolbars/File", position = 0)
@Messages("CTL_GoogleActionListner=Google")
public final class GoogleActionListner extends AbstractAction implements Presenter.Toolbar {

    @Override
    public Component getToolbarPresenter(){
        return new GooglePanel();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
}
