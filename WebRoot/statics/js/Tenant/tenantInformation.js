function createTenant(){
var form = Ext.create('Ext.form.Panel',{
        plain:true,
        border:0,
        bodyPadding:5,
        layout: {
        	type:'vbox',
        	align:'stretch'
        },
        defaultType: 'textfield',
        item:[{
              fieldLabel: 'Tenant Name',
               name: 'tenant',
               allowBlank: false
           },{
               fieldLabel: 'DB Name',
             //  afterLabelTextTpl: required,
               name: 'db',
               allowBlank: false
           }, {
               xtype: 'combo',
               store: Ext.create('Ext.data.ArrayStore', {
                   fields: [ 'Chart of Accounts' ],
                   data: [
                       ['test@example.com'],
                       ['someone@example.com'],
                       ['someone-else@example.com']
                   ]
               })        
           }, {
               xtype: 'combo',
               store: Ext.create('Ext.data.ArrayStore', {
                   fields: [ 'Base Language' ],
                   data: [
                       ['test@example.com'],
                       ['someone@example.com'],
                       ['someone-else@example.com']
                   ]
               })                   
           }, {
               fieldLabel: 'Email',
               name: 'email',
               allowBlank: false,
               vtype:'email'

           }, {
               fieldLabel: 'Phone',
               name: 'phone',
               allowBlank: false
           }],           

        buttons: [{
            text: 'Cancle',
            handler: function() {
            	this.up('form').getForm().reset();
            }              
        },{
            text: '< Back',
            handler: function() {
            	history.go(-1);
            }
            	
        },{
        	text:'Next >',
        	handler: function() {
        		this.up('form').getForm().isValid();
        	}
        }]
    });
var w = new Ext.Window({
	 title: 'Tenant Creation Wizard',
	 collapsible: true,
	 maximizable: true,
	 width: 500,
	 height: 700,
	 minWidth: 100,
	 minHeight: 200,
	 layout: 'fit',
	 items:form,
	 plain: true,
	 bodyStyle: 'padding:5px;',
	 buttonAlign: 'center',
	});
	w.show();
}
